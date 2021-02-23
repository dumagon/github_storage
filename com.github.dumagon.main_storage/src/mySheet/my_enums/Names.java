package mySheet.my_enums;

public enum Names {

    John {
        @Override
        public void myNationality() {
            System.out.println(" I am American");
        }

        private int age=23;

        public int getAge() {
            return age;
        }
    },Sean {
        @Override
        public void myNationality() {

            System.out.println(" I don't wanna tell");

        }

        private int age=20;

        public int getAge() {


            return age;
        }
    },Chuck {
        @Override
        public void myNationality() {

            System.out.println("My nationality is HillBilly");

        }

        private int age=56;

        public int getAge() {
            return age;
        }
    },Marvin {
        @Override
        public void myNationality() {

            System.out.println(" I'm a native American  but it's non of your business ");

        }

        private int age=70;

        public int getAge() {
            return age;
        }
    } ;

    String location;

    int age;

     void myLocation(String location){

         this.location=location;
     }


     public abstract void myNationality ();

    public int getAge() {
        return age;
    }




}
