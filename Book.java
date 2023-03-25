abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book
{
    String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String s)
    {
        this.title=s;

    }
}

class program
{
    public static void main(String[] args)
    {
        MyBook bt=new MyBook();
        bt.setTitle("A tale of two cities");
        System.out.println("The title is:"+bt.getTitle());

    }
}