package practice10;

import java.util.*;

class SortingStudentsByGPA {
    private Student[] iDNumber;

    public void setArray(Student[] students) {
        this.iDNumber = students;
    }

    public void setArray(List<Student> students) {
        this.iDNumber = students.toArray(new Student[0]);
    }

    public void quicksort() {
        if (iDNumber != null) {
            quicksort(0, iDNumber.length - 1);
        }
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi - 1);
            quicksort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = iDNumber[high].getAverageScore();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (iDNumber[j].getAverageScore() >= pivot) {
                i++;
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
            }
        }

        Student temp = iDNumber[i + 1];
        iDNumber[i + 1] = iDNumber[high];
        iDNumber[high] = temp;

        return i + 1;
    }

    public void mergeSort() {
        if (iDNumber != null) {
            iDNumber = mergeSort(iDNumber);
        }
    }

    private Student[] mergeSort(Student[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Student[] left = Arrays.copyOfRange(array, 0, mid);
        Student[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getAverageScore() >= right[j].getAverageScore()) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public void sortBySurname() {
        if (iDNumber != null) {
            Arrays.sort(iDNumber, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getSurname().compareTo(s2.getSurname());
                }
            });
        }
    }

    public void outArray() {
        if (iDNumber != null) {
            for (Student student : iDNumber) {
                System.out.println(student);
            }
        }
    }
}
