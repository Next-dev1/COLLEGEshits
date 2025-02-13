using System;

namespace MathApp
{
    class MathProgram
    {
        static void Main(string[] args)
        {
            double powerResult = Math.Pow(2, 3); // 2^3 = 8
            Console.WriteLine("2 raised to the power of 3 is: {0}", powerResult);
            
            double sqrtResult = Math.Sqrt(25); // 25 = 5
            Console.WriteLine("Square root of 25 is: {0}", sqrtResult);

            double absResult = Math.Abs(-10.5); // -10.5 = 10.5
            Console.WriteLine("Absolute value of -10.5 is: {0}", absResult);
            
            double roundResult = Math.Round(9.6); // Rounds 9.6 to 10
            Console.WriteLine("9.6 rounded is: {0}", roundResult);

            double truncateResult = Math.Truncate(7.8); // Truncates 7.8 to 7
            Console.WriteLine("7.8 truncated is: {0}", truncateResult);
        }
    }
}
//Programmed by Sean :/