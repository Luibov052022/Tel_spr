
public class Contact {

  private String familia;
  private String name;
  private String name2;
  private String burthDay;
  private Long phone;
  private String gender;

  public Contact(String familia, String name, String name2) {
    this.familia = familia;
    this.name = name;
    this.name2 = name2;
  }

  public String getBurthDay() {
    return burthDay;
  }

  public String getFamilia() {
    return familia;
  }

  public String getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public String getName2() {
    return name2;
  }

  public Long getPhone() {
    return phone;
  }

  public void setBurthDay(String burthDay) {
    this.burthDay = burthDay;
  }

  public void setFamilia(String familia) {
    this.familia = familia;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getInfo() {
    return (
      "Фамилия " +
      familia +
      " Имя " +
      name +
      " Отчество " +
      name2 +
      " Дата рождения " +
      burthDay +
      " Телефон " +
      phone +
      " Пол " +
      gender
    );
  }

  
}
