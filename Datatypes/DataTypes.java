import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // Scanners are used to receive data from user or files
        Scanner scanner = new Scanner(System.in);
        
        String greeting = "Hello I'm DataType program,";
        int age = 25;

        //Float datatype in java can hold up to 7 decimals
        float heighFloat = 1.8f;

        //Double datatype in java can hold up to 16 decimals
        double heightDouble = 1.8;
        char gender = 'M';
        boolean Single = true;

        //Modify below this line






        

        // Don't modify below this line

        System.out.print(greeting + " what's you're name? ");
        String name = scanner.nextLine();

        System.out.print("Pleased to meet you " + name);

        System.out.print("\nAre you a man or a woman?\nEnter 'M' for man and 'F' for Woman: ");
         userGender = scanner.next().charAt(0);

        if( userGender == 'M')
        {
            System.out.println("I am a man too 🤟️😎️\n");
        }else{
            System.out.println("Wow I can see you but I'm sure you're a pretty woman 😍️");
        }

        System.out.println("Last I measured my height I was " + heightDouble + "meters");
        System.out.println("What about you, how tall are you?");
         userHeight = scanner.nextDouble();

        if( userHeight > heightDouble && userGender == 'W')
        {
            System.out.println("Unbelievable, you're taller than me 😱️");
        }
        else if ( userHeight > heightDouble && userGender == 'M')
        {
            System.out.println("With " + userHeight + " you'll be a good Basketball player I guess");
        }
        else{
            System.out.println("Wow, nice I'm taller but you are probably smater 😉️");
        }

        System.out.println("\nHmm 🙊️... you are in any relationship right now (true or false)? ");
         isInRelation  = scanner.nextBoolean();

        if( !isInRelation && userGender == 'W')
        {
            System.out.println("Oh you most me a strong lady");
        }
        else if ( !isInRelation )
        {
            System.out.println("So, we are single men 😂️");
        }
        else
        {
            System.out.println("Have a companion is a beautiful gift, but I'll be single for a little longer😌️");
        }





        
    }
    
}
