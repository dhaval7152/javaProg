    class Bank{
        private int no;
        private int balanace;
        public String name;

        void setNoBalance(int getno,int getbalanace){
            no=getno;
            balanace=getbalanace;

        }
        void getBalanace(){
            System.out.println("Balance is :"+balanace);
            System.out.println("Account no is: "+no);
        }

    }
public class priVarClass {
    public static void main(String[] args) {
        Bank dhaval=new Bank();
        dhaval.name="dhaval";
        dhaval.setNoBalance(51,312);
        dhaval.getBalanace();

    }
}
