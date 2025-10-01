package practice4;
// Перечисление времен года
public enum Season {
WINTER(-10), SPRING(15), SUMMER(25),  AUTUMN(10);
private final double avgTemp;  // средняя температура
// Конструктор
Season(double temp) {
        this.avgTemp = temp;    }

    public String getDescription() {
        if (this == SUMMER) {
        return "Теплое время года";
        } else {
        return "Холодное время года";        }
        }

        public double getAvgTemp() {
        return avgTemp;    }

        }
