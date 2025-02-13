using System;

namespace ComputeAverageApp 
{
class ComputeAverageProgram
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter 5 grades separated by new line:");

        double grade1 = Convert.ToDouble(Console.ReadLine());
        double grade2 = Convert.ToDouble(Console.ReadLine());
        double grade3 = Convert.ToDouble(Console.ReadLine());
        double grade4 = Convert.ToDouble(Console.ReadLine());
        double grade5 = Convert.ToDouble(Console.ReadLine());

        double totalGrades = grade1 + grade2 + grade3 + grade4 + grade5;
        double average = totalGrades / 5;
        double roundedAverage = Math.Round(average);

        Console.WriteLine("The average is " + average + " and round off to " + roundedAverage);
        Console.Write("Press any key to exit...");
        Console.ReadKey();
        }
    }
}
//Programmed by Sean :/