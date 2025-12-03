package practice24_26.practice24.task3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditorApplication extends JFrame {
    private IDocument currentDocument;
    private ICreateDocument documentFactory;

    public EditorApplication(ICreateDocument factory) {
        this.documentFactory = factory;
        this.currentDocument = null;

        setTitle("Универсальный редактор - " + getFactoryType(factory));
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createMenu();
        createUI();
    }

    private String getFactoryType(ICreateDocument factory) {
        if (factory instanceof CreateTextDocument) return "Текстовый редактор";
        if (factory instanceof CreateImageDocument) return "Редактор изображений";
        if (factory instanceof CreateMusicDocument) return "Аудио редактор";
        return "Редактор";
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();

        // Меню File
        JMenu fileMenu = new JMenu("Файл");

        JMenuItem newItem = new JMenuItem("Новый");
        newItem.addActionListener(e -> createNewDocument());

        JMenuItem openItem = new JMenuItem("Открыть");
        openItem.addActionListener(e -> openDocument());

        JMenuItem saveItem = new JMenuItem("Сохранить");
        saveItem.addActionListener(e -> saveDocument());

        JMenuItem closeItem = new JMenuItem("Закрыть");
        closeItem.addActionListener(e -> closeDocument());

        JMenuItem exitItem = new JMenuItem("Выход");
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(closeItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Меню Помощь
        JMenu helpMenu = new JMenu("Помощь");
        JMenuItem aboutItem = new JMenuItem("О программе");
        aboutItem.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Универсальный редактор\nИспользует паттерн Фабричный метод\n" +
                                "Текущая фабрика: " + getFactoryType(documentFactory),
                        "О программе",
                        JOptionPane.INFORMATION_MESSAGE));

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
    }

    private void createUI() {
        JPanel panel = new JPanel(new BorderLayout());

        // Панель статуса
        JLabel statusLabel = new JLabel("Документ не открыт");
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(statusLabel, BorderLayout.SOUTH);

        // Текстовая область для отображения информации
        JTextArea infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setText("Добро пожаловать в универсальный редактор!\n\n" +
                "Используйте меню Файл для работы с документами.\n" +
                "Текущий тип редактора: " + getFactoryType(documentFactory));

        JScrollPane scrollPane = new JScrollPane(infoArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Обновление статуса при изменении документа
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                if (currentDocument != null) {
                    statusLabel.setText("Открыт: " + currentDocument.getType());
                    infoArea.setText("Тип документа: " + currentDocument.getType() + "\n" +
                            "Содержимое: " + currentDocument.getContent());
                } else {
                    statusLabel.setText("Документ не открыт");
                }
            }
        });

        add(panel);
    }

    private void createNewDocument() {
        currentDocument = documentFactory.createNew();
        if (currentDocument != null) {
            currentDocument.open();
            JOptionPane.showMessageDialog(this,
                    "Создан новый документ: " + currentDocument.getType(),
                    "Создание",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openDocument() {
        currentDocument = documentFactory.createOpen();
        if (currentDocument != null) {
            currentDocument.open();
            JOptionPane.showMessageDialog(this,
                    "Открыт документ: " + currentDocument.getType(),
                    "Открытие",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void saveDocument() {
        if (currentDocument != null) {
            currentDocument.save();
            JOptionPane.showMessageDialog(this,
                    "Документ сохранен: " + currentDocument.getType(),
                    "Сохранение",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Нет открытого документа для сохранения!",
                    "Ошибка",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void closeDocument() {
        if (currentDocument != null) {
            currentDocument.close();
            currentDocument = null;
            JOptionPane.showMessageDialog(this,
                    "Документ закрыт",
                    "Закрытие",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Нет открытого документа!",
                    "Ошибка",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
