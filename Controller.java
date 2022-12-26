import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import javax.management.RuntimeErrorException;

public class Controller {

  public static void start() throws IOException {
    Contact contact = consoleInput();
    writeFile(contact);
  }

  public static Contact consoleInput() {
    System.out.println(
      "Введите 6 параметров: Фамилия Имя Отчество датарождения(mm/dd/yyyy) номертелефона пол(m,f)"
    );
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");

    System.out.println(Arrays.toString(str));
    if (str.length < 6) {
      throw new RuntimeErrorException(
        null,
        "некорретный ввод. нужно ввести 6 параметров."
      );
    }
    Contact contact = new Contact(str[0], str[1], str[2]);
    try {
      DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
      Date burthDay = df.parse(str[3]);
      contact.setBurthDay(str[3]);
    } catch (ParseException e) {
      throw new RuntimeException("проверьте формат дня рождения!");
    }
    try {
      Long phone = Long.parseLong(str[4]);
      contact.setPhone(phone);
    } catch (NumberFormatException e) {
      throw new RuntimeException("проверьте формат телефона!");
    }

    if (str[5].equals("m") || str[5].equals("f")) {
      contact.setGender(str[5]);
    } else {
      throw new RuntimeException("проверьте формат пола!");
    }

    return contact;
  }

  public static void writeFile(Contact c) throws IOException {
    try (FileWriter w = new FileWriter(c.getFamilia() + "txt", true)) {
      w.write(c.getInfo());
    }
  }
}
