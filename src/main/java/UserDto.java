public class UserDto {

               private String name;
               private double age;
               private double height;

        public UserDto(String name, double age, double height){
                this.name = name;
                this. age = age;
                this. height = height;
        }
                public void checkAge(){

                        if ( this.age > 30 &&  this.height > 160) {
                                System.out.println("User is older than 30 and higher then 160cm");
                        } else {
                                System.out.println("User is younger than 30 or lower than 160cm");
                        }
                }
        }
