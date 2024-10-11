package studentregistration;
import java.util.Scanner;

public class Studentregistrations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decision, username, username1, password, password1, choice;
        
        String[] firstname = new String[50];
        String[] middlename = new String[50];
        String[] lastname = new String[50];         
        String[] section = new String[50];
        String[] gender = new String[50];
        String[] religion = new String[50];
        
        int[] age = new int[50];
        int[] contact = new int[50];
        
        username = "admin"; // bale eto yung mga value na hihingin sa login system naten
        password = "password"; // bale eto yung mga value na hihingin sa login system naten

        System.out.println("Welcome to the Student Registration System");
        System.out.println("Before you can access the program, you must log in first");

        while (true) { //dito nag lagay ako ng looping condition once na tumugma yung value na inimput ng user sa username and password sa value ng line 18 & 19 mag bbreak sya sa loop tas dederetso na sya sa line 38
            System.out.print("Enter username: "); // username = admin
            username1 = input.nextLine();
            System.out.print("Enter password: "); // username = password
            password1 = input.nextLine();

            if (username1.equals(username) && password1.equals(password)) { // Dito bagsak nya kapag tumugma yung user input sa value ng username pati password line 18/19
                System.out.println("Congratulations! You have gained access to the student registration system");
                break; // bale nag lagay ako ng break dito meaning once na, na meet nya na ung condition mag bbreak na yung program tas dederetso sya sa line 38
            } else { // Dito nman sya babagsak kung hindi tugma yung inimput ng user sa value na hinihingi. Since wla syang break tapos naka looping ako babalik sya sa line 24 para hingin ulit ung  user inputs
                System.out.println("Invalid username or password, please enter a valid username and password"); // Once na ilabas na ito sa output babalik na sya sa line  24
            }
        }

        while (true) { // Another looping, ma iinitialize lng to once na ma fullfill nya yung condition ng line 30
            System.out.println();
            System.out.print("Would you like to register a student? (YES/NO): "); // Yes or NO condition bale nag initialize ako ng dalawang if at isang else para dito
            decision = input.nextLine();
            System.out.println();

            if (decision.equalsIgnoreCase("YES")) { // Once na yes yung inimput ng user mag iinitialize to
                for (int i = 0; i < 50; i++) { // so sa loob ng if na condition nag lagay ako ng for loop. astig diba pwede yon. since 50 lang yung maximum value ng array ko kase 50 lang yung nilagay ko sa line 8-13 edi 50 din nilagay ko
                    System.out.print("Enter Section: "); // Section yung ilalagay dito ha
                    section[i] = input.nextLine();
                    
                    System.out.print("Enter First Name: "); // Tas dito naman yung first name mo na gusto mong ilagay
                    firstname[i] = input.nextLine(); // String to
                    
                    System.out.print("Enter Middle Name: "); // Tas dito naman yung middle name mo na gusto mong ilagay
                    middlename[i] = input.nextLine(); // String to
                    
                    System.out.print("Enter Last Name: "); // Tas dito naman yung last name mo na gusto mong ilagay
                    lastname[i] = input.nextLine(); // String to
                    
                    System.out.print("Enter Age: "); // Tas dito naman age mo na gusto mong ilagay
                    age[i] = input.nextInt(); // Int to meaning number lang pwede mong ilagay dito
                    
                    System.out.print("Enter Gender: "); // Tas dito naman gender mo na gusto mong ilagay
                    input.nextLine();  // String to
                    gender[i] = input.nextLine();
                    
                    System.out.print("Enter Religion: "); // Tas dito naman religion mo na gusto mong ilagay
                    religion[i] = input.nextLine(); // String to
                    
                    System.out.print("Enter contact: "); // Tas dito naman Contact number mo na gusto mong ilagay
                    contact[i] = input.nextInt(); // int to meaning number lang din pwede mong ilagay dito

                    System.out.println("Successfully registered a student"); // Once na i print to meaning successfully nang nakapag registered yung student bale confirmation lng to
                    System.out.println(); // Spacing lang to para hindi pangit tignan

                    System.out.print("Do you want to review the records? Type 'yes' to review, 'no' to add another student, or 'stop' to terminate: ");  // Once na ma enter na ng user yung student detailed iinformation mag didisplay to
                    input.nextLine();  // So baket nag add ako ng nextLine dito kase Int yung last na ginamit sa line 69 meaning need mong i convert yung binasa ng system na int to string so ang mang yayare kapag hindi ko sya nilagyan ng nextLine mag coconvert lng sya sa string tapos hindi nya babasahin yung sa lie 76
                    choice = input.nextLine(); // yes, no pati lastly stop yung pipiliin mo dapat dito e pano kung binaboy? sa line 97 yung bagsak nya

                    if (choice.equalsIgnoreCase("yes")) { // so once na inenter ng user is yes bale mag iinitialize naman to
                        for (int j = 0; j <= i; j++) { // another loop kung saan dito mo ma viview yung mga student na ni register mo
                            System.out.println("Section: " + section[j] + "  First Name: " + firstname[j] + "  Middle Name: " + middlename[j] + "  Last Name: " + lastname[j] + "  Age: " + age[j] + "  Gender: " + gender[j] + "  Religion: " + religion[j] + " Contact: " + contact[j]);
                        }  
                        System.out.println();

                        System.out.print("Do you want to add another student (Yes/No): "); // mag iinitialize naman to pag na print na yung student information sa line 80
                        choice = input.nextLine(); // user input to
                        
                        if (choice.equalsIgnoreCase("no")){ // mag iinitialize naman to pag no yung inimput mo sa line 85
                            System.out.println("Ok, thanks for using our program"); //on
                            break;  // Since nga diba sa loob ng while(true) merong for loop tas sa loob ng for loop may if condition tas once na ma meet yung condition may isa pang for loop meaning pag na print nya na yung output nato babalik na sya sa line 40 which is yung pinakaunang for loop
                     
                        }
                        // bale hindi nako nag lagay ng else dito, so pag yes yung inumput ng user sa line 85 since nga nasa looping system parin to tas wla pang break bale babalik sya sa line 45
                    } else if (choice.equalsIgnoreCase("stop")) { // tas eto pag stop yung pinili ng user sa line 74 mag iinitialize to
                        System.out.println("Exiting the student registration system"); // 
                        break; // so bale pag stop yung pinila nng user sa line 74 babalik sya sa line 40 which is tatanungin nya yung user kung mag reregister sya ulet kung hinde
                    } else if (choice.equalsIgnoreCase("no")) { // eto wla lang to so pag no yung pinili ng user sa line 74 babalik ulit sya sa looping system kase nga diba type no to add another student
                        
                    } 
                }
            } else if (decision.equalsIgnoreCase("NO")) { // Mag iinitialize naman to pag NO yung inimput ng user nasa line 40 ung choices
                System.out.println("Program Terminated");
                break;
                
            } else { // Ma iinitialize lang to kapag wla sa choices yung inimput ng user. btw nasa line 40 ung choices
                System.out.println("Invalid input, please enter a valid choice!"); // Since nga dba nasa looping condition parin to meaning pag tapos nyang i print to babalik sya sa line 38
            }
        }
    }
}
