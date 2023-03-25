public class Sports
{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }

}

class Soccer extends Sports{
    int title;
    @Override
    String getName(){
        return "Soccer Class";
    }
    public void setNumberOfTeamMembers(int s)
    {
        this.title=s;

    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has "+title+" players in " + getName());
    }
}

class games
{
    public static void main(String[] args)
    {
        Sports yu=new Sports();
        System.out.println(yu.getName());
        yu.getNumberOfTeamMembers();
        Soccer vu=new Soccer();
        System.out.println(vu.getName());
        vu.setNumberOfTeamMembers(11);
        vu.getNumberOfTeamMembers();

    }
}