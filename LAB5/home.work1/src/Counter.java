public class Counter
{
        private int number;
        private boolean rot1=true;
        public void click()
        {
         this.number++;
        }
         public void display()
        {
          System.out.println(this.number);

        }

        public void returns()
        {
            this.number=0;

        }

        public void undo()
        {
            this.number=(this.rot1==true)?this.number-1:this.number-0;
           rot1=false;

        }


    }


