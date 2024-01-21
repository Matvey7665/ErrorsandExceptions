package Seminar3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    String surname;
    String name;
    String patronymic;
    String birthday;
    int phone;
    String sex;

    public User(String surname, String name, String patronymic, String birthday, int phone, String sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone=" + phone +
                ", sex=" + sex +
                '}';
    }
    public File saveUser(User user){
        File surnuser =  new File(user.getSurname());
        try(FileWriter wr = new FileWriter(surnuser,true)) {

            if (user.getSurname().equals(surnuser.getName())){
                FileWriter writer = new FileWriter(surnuser,true);
                wr.write(user.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return surnuser;
    }
}


