public class Limit
{
    private int number;

    private  int limit;

    public void setLimit(int mux)
    {
   limit=mux;
    }


    public void click()
    {
    this.number++;

    if (number>limit)
     number=limit;

    }

    public void display()
    {
        System.out.println(this.number);

    }



}


