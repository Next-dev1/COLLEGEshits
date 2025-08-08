using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Account_Registration
{
    public partial class FrmConfirm : Form
    {
        // Delegate instances
        private StudentInfoClass.DelegateText DelProgram, DelLastName, DelFirstName, DelMiddleName, DelAddress;
        private StudentInfoClass.DelegateNumber DelNumAge, DelContactNo, DelStudNo;
        public FrmConfirm()
        {
            InitializeComponent();

            // Initialize delegates
            DelProgram = new StudentInfoClass.DelegateText(StudentInfoClass.GetProgram);
            DelFirstName = new StudentInfoClass.DelegateText(StudentInfoClass.GetFirstName);
            DelMiddleName = new StudentInfoClass.DelegateText(StudentInfoClass.GetMiddleName);
            DelLastName = new StudentInfoClass.DelegateText(StudentInfoClass.GetLastName);
            DelAddress = new StudentInfoClass.DelegateText(StudentInfoClass.GetAddress);

            DelNumAge = new StudentInfoClass.DelegateNumber(StudentInfoClass.GetAge);
            DelContactNo = new StudentInfoClass.DelegateNumber(StudentInfoClass.GetContactNo);
            DelStudNo = new StudentInfoClass.DelegateNumber(StudentInfoClass.GetStudentNo);
        }

        private void FrmConfirm_Load_1(object sender, EventArgs e)
        {
            // Display values in labels
            prog_lbl.Text = DelProgram(StudentInfoClass.Program);
            fn_lbl.Text = DelFirstName(StudentInfoClass.FirstName);
            mn_lbl.Text = DelMiddleName(StudentInfoClass.MiddleName);
            ln_lbl.Text = DelLastName(StudentInfoClass.LastName);
            address_lbl.Text = DelAddress(StudentInfoClass.Address);
            age_lbl.Text = DelNumAge(StudentInfoClass.Age).ToString();
            studentNo_lbl.Text = DelStudNo(StudentInfoClass.StudentNo).ToString();
            contactNo_lbl.Text = DelContactNo(StudentInfoClass.ContactNo).ToString();
        }

        private void btn_Confirm_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.OK;
            this.Close();
        }
        private void FrmConfirm_FormClosing(object sender, FormClosingEventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }

        
    }
}
