using System;

namespace StudentGradeApplication
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {
            String Name = textBox1.Text;
            double english = Convert.ToDouble(txtEnglish.Text);
            double math = Convert.ToDouble(txtMath.Text);
            double science = Convert.ToDouble(txtScience.Text);
            double filipino = Convert.ToDouble(txtFilipino.Text);
            double history = Convert.ToDouble(txtHistory.Text);

            double average = (english + math + science + filipino + history) / 5;
            string result = average >= 75.00 ? "The Student Passed." : "The Student Failed.";

            lblResult.Text = result + "\nThe General Average of " + Name + " is " + average.ToString("F2") + ".";

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        }
    }

