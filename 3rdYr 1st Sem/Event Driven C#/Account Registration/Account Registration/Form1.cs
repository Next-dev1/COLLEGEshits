using System;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace Account_Registration
{
    public partial class FrmRegistration : Form
    {
        public FrmRegistration()
        {
            InitializeComponent();

            cbProg.Items.Add("BS in Computer Science");
        }

        private void Next_Click(object sender, EventArgs e)
        {
            // Assign values from input controls
            StudentInfoClass.Program = cbProg.Text.ToString();
            StudentInfoClass.FirstName = fn_txt.Text.ToString();
            StudentInfoClass.LastName = ln_txt.Text.ToString();
            StudentInfoClass.MiddleName = mn_txt.Text.ToString();
            StudentInfoClass.Address = address_txt.Text.ToString();
            StudentInfoClass.Age = long.Parse(age_txt.Text);
            StudentInfoClass.ContactNo = long.Parse(contactNo_txt.Text);
            StudentInfoClass.StudentNo = long.Parse(studentNo_txt.Text);

            using (FrmConfirm fc = new FrmConfirm())
            {
                if (fc.ShowDialog() == DialogResult.OK)
                {
                    ResetControls();
                }
            }
        }
        private void ResetControls()
        {
            cbProg.SelectedIndex = -1;
            fn_txt.Clear();
            ln_txt.Clear();
            mn_txt.Clear();
            address_txt.Clear();
            age_txt.Clear();
            contactNo_txt.Clear();
            studentNo_txt.Clear();
        }
        
        }
    }

