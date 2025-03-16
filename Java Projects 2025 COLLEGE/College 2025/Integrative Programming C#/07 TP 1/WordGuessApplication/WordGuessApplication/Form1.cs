using System;
using System.Text;
using System.Windows.Forms;

namespace WordGuessApplication
{
    public partial class Form1 : Form
    {

        private string wordToGuess = "computer";
        private StringBuilder maskedWord = new StringBuilder("c???????r");


        public Form1()
        {
            InitializeComponent();
            InitializeGame();
        }
        private void InitializeGame()
        {
            lblWord.Text = maskedWord.ToString();
        }
        private void btnGuess_Click(object sender, EventArgs e)
        {
            string userGuess = txtGuess.Text.Trim().ToLower();

            if (string.IsNullOrEmpty(userGuess))
            {
                MessageBox.Show("Please enter a guess.", "Input Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            if (userGuess == wordToGuess)
            {
                lblWord.Text = wordToGuess;
                MessageBox.Show("Correct guess!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                if (!lstWrongGuesses.Items.Contains(userGuess))
                {
                    lstWrongGuesses.Items.Add(userGuess);
                }
                MessageBox.Show("Wrong guess! Try again.", "Incorrect", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

            txtGuess.Clear();
            txtGuess.Focus();
        }


        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void lblWord_Click(object sender, EventArgs e)
        {

        }

        private void lblWrongGuesses_Click(object sender, EventArgs e)
        {

        }

        private void lstWrongGuesses_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}

//Programmed by Sean :\