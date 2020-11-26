class MyName {
    private String firstName;
    private String lastName;
     
    MyName(String name) {
        String[] list = name.split(" ", 2);
        firstName = list[0];
        lastName = list[1];
    }
 
    MyName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
 
    String getFirstName(){
        return firstName;
    }
 
    String getLastName(){
        return lastName;
    }
 
    void setFirstName(String name){
        this.firstName = name;
    }
 
    void setLastName(String name){
        this.lastName = name;
    }
 
    public String toString(){
        return lastName + " " + firstName;
    }
}


class MyDate {

  Private int year;
  Private int month;
  Private int day;

  MyDate(int y, int m, int d) {

    this.year = y;

    this.month = m;

    this.day = d;

  }

  MyDate(String yearmonthday){

    String[] a = yearmonthday.split("/",0);

    this.year = Integer.parseInt(a[0]);
    this.month = Integer.parseInt(a[1]);
    this.day = Integer.parseInt(a[2]);

  }

  int getYear(){
    return year;
  }
 
  int getMonth(){
    return Month;
  }

  int getDay(){
    return Day;
  }
 
  void setYear(int year){
    this.year = year;
  }
 
  void setMonth(int Month){
    this.Month = month;
  }
  
  void setDay(int Day){
    this.Day = day;
  }

  @Override
    public String toString(){
        return year + "/" + month+ " " + day;
  }


}

class Person {

  MyName name;

  MyDate birthday;

  String phoneNumber;

  Person[] friends;

  Person(String name, MyDate birthday, String phone) {

    this.name = new MyName(name);

    this.birthday = birthday;

    this.phoneNumber = phone;

  }

  Person(String name, int year, int month, int day, String phone) {

    this.name = new MyName(name);

    this.birthday = new MyDate(year, month, day);

    this.phoneNumber = phone;

  }

  Person(MyName name, int year, int month, int day, String phone) {

    this.name = name;

    this.birthday = new MyDate(year, month, day);

    this.phoneNumber = phone;

  }

  Person(MyName name, MyDate birthday, String phone) {

    this.name = name;

    this.birthday = birthday;

    this.phoneNumber = phone;

  }

  @Override

  public String toString(){

    int i;

    String str;

    str = "NAME: "

    + name

    +" (Date of Birth: "

    + birthday

    + ")\n"

    + " Number of friends = "

    + this.friends.length

    + "\n";

    for( i = 0; i < this.friends.length; i ++ ) {

      str = str

      + " Name of friend "

      + i

      + ": "

      + this.friends[i].name

      + " (Date of Birth: " + this.friends[i].birthday.year

      + "/" + this.friends[i].birthday.month

      + "/" + this.friends[i].birthday.day

      + ")\n";

    }

    return str;

  }

}

class Ex7_3 {

  public static void main(String args[]) {

    // create objects

    Person person1 = new Person("Taro Tokyo" , 1985, 9, 20, "080-1234-5678");//4

    Person person2 = new Person(new MyName("Jiro", "Osaka") , 1981, 6, 18, "090-8765-4321");//1

    Person person3 = new Person(new MyName("Saburo Aichi"), new MyDate(1981, 12, 23), "090-3333-5555");//2

    Person person4 = new Person("Shiro Gifu", new MyDate(1974, 2, 3), "090-2222-1111");//3

    // register friends of each person

    // Taro's friends

    Person[] person1Friends = new Person[2];

    person1Friends[0] = person2; // Jiro

    person1Friends[1] = person3; // Saburo

    // Jiro's friends

    Person[] person2Friends = new Person[3];

    person2Friends[0] = person1; // Taro

    person2Friends[1] = person3; // Saburo

    person2Friends[2] = person4; //Shiro

    // Saburo's friends

    Person[] person3Friends = new Person[1];

    person3Friends[0] = person4; // Shiro

    // Shiro's friends

    Person[] person4Friends = new Person[2];

    person4Friends[0] = person2; // Jiro

    person4Friends[1] = person3; // Saburo

    // set values to each object

    person1.friends = person1Friends;

    person2.friends = person2Friends;

    person3.friends = person3Friends;

    person4.friends = person4Friends;

    // print each person's data

    System.out.print(person1);

    System.out.print(person2);

    System.out.print(person3);

    System.out.print(person4);

  }

}