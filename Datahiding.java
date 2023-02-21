abstract class Datahiding {


abstract void showdata();


}

class Data extends Datahiding {

void showdata()
{

System.out.println("This an example of abstract class method data hiding");

}
}


class Main {

public static void main (String args [])
{

Data dt=new Data();
dt.showdata();


}


}
