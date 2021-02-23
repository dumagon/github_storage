package enumeratition_enum.enumeration_with_fields;

enum Dwarfs_Warriors {GIMLY("axe-wielding dwarf "),ROGAR("having a long sledge"),
    GORIN("a skinner , turns into a bear");

    String skills;

       Dwarfs_Warriors (String skills){

           this.skills=skills;
       }

       String getSkills(){
           return skills;
       }
}

public class Dwarfs {
    public static void main(String[] args) {

        Dwarfs_Warriors myDwarf = Dwarfs_Warriors.GIMLY;

        System.out.println("my warrior is "+myDwarf+" ( "+myDwarf.getSkills()+") ");

        Dwarfs_Warriors myDwarf1 = Dwarfs_Warriors.GORIN;

        System.out.println("my warrior is "+myDwarf1+" ( "+myDwarf1.getSkills()+") ");

        Dwarfs_Warriors myDwarf2 = Dwarfs_Warriors.ROGAR;

        System.out.println("my warrior is "+myDwarf2+" ( "+myDwarf2.getSkills()+") ");

    }
}
