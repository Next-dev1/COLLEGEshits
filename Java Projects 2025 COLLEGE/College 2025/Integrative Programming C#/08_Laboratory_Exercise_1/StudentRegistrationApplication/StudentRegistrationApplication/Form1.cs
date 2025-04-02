using System;
using System.Collections;
using System.Drawing;
using System.Windows.Forms;
using AForge.Video;
using AForge.Video.DirectShow;

namespace StudentRegistrationApplication
{
    public partial class frmStudentRegistration : Form
    {
        private FilterInfoCollection videoDevices;
        private VideoCaptureDevice videoSource;
        public frmStudentRegistration()
        {

            InitializeComponent();
            videoDevices = new FilterInfoCollection(FilterCategory.VideoInputDevice);
            if (videoDevices.Count > 0)
            {
                videoSource = new VideoCaptureDevice(videoDevices[0].MonikerString);
                videoSource.NewFrame += new NewFrameEventHandler(video_NewFrame);
            }


            string[] months = new string[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
            ArrayList programs = new ArrayList() { "Bachelor of Science in Computer Science", "Bachelor of Science in Information Technology", "Bachelor of Science in Information Systems", "Bachelor of Science in Computer Engineering" };

            for (int i = 1; i <= 31; i++)
            {
                cbDay.Items.Add(i);
            }
            for (int i = 1900; i <= 2023; i++)
            {
                cbYear.Items.Add(i);
            }
            foreach (string m in months)
            {
                cbMonth.Items.Add(m);
            }
            foreach (string p in programs)
            {
                cbProgram.Items.Add(p);
            }
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            ShowMessage(txtFirstName.Text, txtMiddleName.Text, txtLastName.Text, rbMale.Checked, rbFemale.Checked, cbDay.SelectedItem.ToString(), cbMonth.SelectedItem.ToString(), cbYear.SelectedItem.ToString(), cbProgram.SelectedItem.ToString());
            ShowMessage(txtFirstName.Text, txtMiddleName.Text, txtLastName.Text, cbProgram.SelectedItem.ToString());
            ShowMessage(txtFirstName.Text, txtLastName.Text, cbProgram.SelectedItem.ToString());
        }

        private string GetGender(bool m, bool f)
        {
            if (m) return rbMale.Text;
            if (f) return rbFemale.Text;
            return "";
        }

        private void BtnCapture_Click(object sender, EventArgs e)
        {
            if (videoSource != null && !videoSource.IsRunning)
            {
                videoSource.Start();
            }
            else if (videoSource.IsRunning)
            {
                videoSource.SignalToStop();
            }
        }

        private void video_NewFrame(object sender, NewFrameEventArgs eventArgs)
        {
            Video_NewFrame.Image = (Bitmap)eventArgs.Frame.Clone();
        }

        protected override void OnFormClosing(FormClosingEventArgs e)
        {
            if (videoSource != null && videoSource.IsRunning)
            {
                videoSource.SignalToStop();
                videoSource.WaitForStop();
            }
            base.OnFormClosing(e);
        }
        private void ShowMessage(string fn, string mn, string ln, bool m, bool f, string day, string month, string year, string p)
        {
            MessageBox.Show("Student Name: " + fn + " " + mn + " " + ln + "\nGender: " + GetGender(m, f) + "\nDate of Birth: " + day + "/" + month + "/" + year + "\nProgram: " + p);
        }

        private void ShowMessage(string fn, string mn, string ln, string p)
        {
            MessageBox.Show("Student Name: " + fn + " " + mn + " " + ln + "\nProgram: " + p);
        }

        private void ShowMessage(string fn, string ln, string p)
        {
            MessageBox.Show("Student Name: " + fn + " " + ln + "\nProgram: " + p);
        }
    }
}

//Programmed by Sean :\