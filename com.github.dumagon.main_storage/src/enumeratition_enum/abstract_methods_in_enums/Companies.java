package enumeratition_enum.abstract_methods_in_enums;

public enum Companies {
    GOOGLE(1500){
           @Override
        public int getValue(){
            return 10+this.value;
        }
          @Override
      public   String getCurrency (){
            return "dollars";
        }
        @Override
        public String toString (){
            return "My "+super.toString();
        }
    },

    APPLE(2000){

        @Override

        public int getValue(){
            return this.value;
        }

        @Override
        public String getCurrency() {
            return "dollars";
        }
        @Override
        public String toString (){
            return "My "+super.toString();
        }
    },

    MAC(1300){

        @Override

        public int getValue(){
            return this.value;
        }

        @Override
        public String getCurrency() {
            return "euros";
        }

        @Override
        public String toString (){
            return "My  "+super.toString();
        }
    };
    int value;

    Companies(int value){

        this.value=value;

    }

    public int getValue(){ return value; }

    public abstract String getCurrency ();

    public String toString (){
        return " company is "+super.toString()+" and my monthly salary is "+getValue()+" "+getCurrency();
    }



}
