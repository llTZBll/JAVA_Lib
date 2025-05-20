public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2023, 2, 28);
        System.out.println(date1.toString()); // 2023/2/28

        date1.setDay(29); // 无效设置，2023不是闰年
        System.out.println(date1.toString()); // 仍为2023/2/28

        MyDate date2 = new MyDate(2024, 2, 28); // 2024是闰年
        date2.setDay(29); // 有效设置
        System.out.println(date2.toString()); // 2024/2/29

        date2.setMonth(13); // 无效月份
        System.out.println(date2.toString()); // 仍为2024/2/29
    }
}