using System;

class Program
{
    static void Main()
    {
        // 1. A one-dimensional array that contains six (6) names of your classmates. Then, print the names using a foreach loop.
        string[] classmates = { "Jasther", "Jurelle", "Xavier", "Jason", "Godwin", "Miguel" };
        
        // Print names using foreach loop
        foreach (string name in classmates)
        {
            Console.WriteLine(name);
        }

        // 2. A two-dimensional array with two (2) rows and three (3) columns. Then, initialize the array with the first six (6) letters of the alphabet as its elements.
        char[,] letters = {
            { 'A', 'B', 'C' },
            { 'D', 'E', 'F' }
        };
        
        // 3. A string with any message. Then, determine if the message contains the string, "hello".
        string message = "Hello, are you good?";
        
        if (message.ToLower().Contains("hello"))
        {
            Console.WriteLine("The message contains 'hello'.");
        }
        else
        {
            Console.WriteLine("The message does not contain 'hello'.");
        }
    }
}