public class lab2 {
    public static void main(String[] args) {
        String[] dataArray = {
                "Національний Лісотехнічний Університет України",
                "КНІТ",
                "ІПЗ-21",
                "Інженерія Програмного Забезпечення"
        };

        // об'єднання всіх елементів масиву в один рядок
        String concatString = dataArray[0] + " " + dataArray[1] + " " + dataArray[2] + " " + dataArray[3];

        char[] array = concatString.toCharArray();

        // створити рядок 1 без назви спеціальності
        String str1 = concatString.replace("Інженерія Програмного Забезпечення", "");
        System.out.println("Рядок 1: " + str1);

        // створити рядок 2 що є віддзеркаленням рядка 1
        String str2 = new StringBuilder(str1).reverse().toString();
        System.out.println("Рядок 2 (дзеркальне зображення): " + str2);

        // створити рядок 3 з рядка 1 де малі букви замінені на великі
        String str3 = str1.toUpperCase();
        System.out.println("Рядок 3: " + str3);

        // порівняння рядку 1 і рядку 3
        boolean isEqual = str1.equalsIgnoreCase(str3);
        System.out.println("Рядок 1 і Рядок 3 рівні: " + isEqual);

        // вибрати з рядку 1 назву інституту
        String instituteName = dataArray[1];
        System.out.println("Назва Інституту: " + instituteName);

        // номер спеціальності (окремо задаємо 121)
        String speciality = "121";
        System.out.println("Номер спеціальності: " + speciality);

        // створити рядок 4 що є об’єднанням рядка 1 і рядка 3
        String str4 = str1 + " " + str3;
        System.out.println("Рядок 4: " + str4);

        // визначити індекс першого і останнього входження літери "О"
        int firstIndex = str1.indexOf("О");
        int lastIndex = str1.lastIndexOf("О");
        System.out.println("Перше входження літери 'О': " + firstIndex);
        System.out.println("Останнє входження літери 'О': " + lastIndex);

        // створити рядок з особистими даними
        StringBuffer personalData = new StringBuffer("Сподарко Дмитро Ігорович 06.11.2006");
        System.out.println("Особисті дані: " + personalData);

        // вилучити число і місяць народження, додати місце народження
        personalData.delete(23, 28); // вирізає "06.11"
        personalData.append(" Львів");
        System.out.println("Після додавання місця народження: " + personalData);

        // вставити свою стать після року народження
        personalData.insert(24, " Чоловіча стать");
        System.out.println("Після вставки статі: " + personalData);

        // визначити довжину рядка
        int length = personalData.length();
        int bytes = personalData.toString().getBytes().length;
        System.out.println("Довжина рядка: " + length);
        System.out.println("Довжина рядка у байтах: " + bytes);

        // скоротити рядок
        personalData.setLength(22);
        System.out.println("Скорочений рядок: " + personalData);

        // відзеркалити своє прізвище
        String surname = "Сподарко";
        String mirrorSurname = new StringBuilder(surname).reverse().toString();
        System.out.println("Прізвище (відзеркалене): " + mirrorSurname);
    }
}
