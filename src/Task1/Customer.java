package Task1;

public class Customer {
    //Task 1.a
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    //Task 1.b
    Customer(String firstName,String lastName,String username){
        this.firstName = firstName;
        this.lastName =lastName;
        this.username = username;
        this.id= counter++;


    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public String getUsername(){
        return username;

    }
    public int getId(){
        return id;
    }
    public int getCounter(){
        return counter;
    }


    @Override
    //Task 1.d
    public String toString(){
        String userinfo= this.firstName + " "+ this.lastName+"\n"+this.username+"\n"+this.id;

        return userinfo;



    }

}
