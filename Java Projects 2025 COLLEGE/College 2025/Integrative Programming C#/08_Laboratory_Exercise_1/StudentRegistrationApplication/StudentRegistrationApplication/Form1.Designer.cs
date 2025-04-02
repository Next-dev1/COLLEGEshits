namespace StudentRegistrationApplication
{
    partial class frmStudentRegistration
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            lblFormName = new Label();
            lblLastName = new Label();
            lblFirstName = new Label();
            lblMiddleName = new Label();
            txtLastName = new TextBox();
            txtFirstName = new TextBox();
            txtMiddleName = new TextBox();
            lblGender = new Label();
            rbMale = new RadioButton();
            rbFemale = new RadioButton();
            lblDateOfBirth = new Label();
            cbDay = new ComboBox();
            cbMonth = new ComboBox();
            cbYear = new ComboBox();
            btnSubmit = new Button();
            lblProgram = new Label();
            cbProgram = new ComboBox();
            Video_NewFrame = new PictureBox();
            btnCapture_Click = new Button();
            fileSystemWatcher1 = new FileSystemWatcher();
            ((System.ComponentModel.ISupportInitialize)Video_NewFrame).BeginInit();
            ((System.ComponentModel.ISupportInitialize)fileSystemWatcher1).BeginInit();
            SuspendLayout();
            // 
            // lblFormName
            // 
            lblFormName.AutoSize = true;
            lblFormName.Font = new Font("Microsoft Sans Serif", 16.2F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblFormName.Location = new Point(9, 9);
            lblFormName.Margin = new Padding(2, 0, 2, 0);
            lblFormName.Name = "lblFormName";
            lblFormName.Size = new Size(291, 26);
            lblFormName.TabIndex = 0;
            lblFormName.Text = "Student Registration Form";
            // 
            // lblLastName
            // 
            lblLastName.AutoSize = true;
            lblLastName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblLastName.Location = new Point(18, 57);
            lblLastName.Margin = new Padding(2, 0, 2, 0);
            lblLastName.Name = "lblLastName";
            lblLastName.Size = new Size(107, 20);
            lblLastName.TabIndex = 1;
            lblLastName.Text = "Last Name *";
            // 
            // lblFirstName
            // 
            lblFirstName.AutoSize = true;
            lblFirstName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblFirstName.Location = new Point(18, 132);
            lblFirstName.Margin = new Padding(2, 0, 2, 0);
            lblFirstName.Name = "lblFirstName";
            lblFirstName.Size = new Size(108, 20);
            lblFirstName.TabIndex = 2;
            lblFirstName.Text = "First Name *";
            // 
            // lblMiddleName
            // 
            lblMiddleName.AutoSize = true;
            lblMiddleName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblMiddleName.Location = new Point(18, 207);
            lblMiddleName.Margin = new Padding(2, 0, 2, 0);
            lblMiddleName.Name = "lblMiddleName";
            lblMiddleName.Size = new Size(124, 20);
            lblMiddleName.TabIndex = 3;
            lblMiddleName.Text = "Middle Name *";
            // 
            // txtLastName
            // 
            txtLastName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            txtLastName.Location = new Point(22, 93);
            txtLastName.Margin = new Padding(2);
            txtLastName.Name = "txtLastName";
            txtLastName.Size = new Size(350, 26);
            txtLastName.TabIndex = 4;
            // 
            // txtFirstName
            // 
            txtFirstName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            txtFirstName.Location = new Point(22, 168);
            txtFirstName.Margin = new Padding(2);
            txtFirstName.Name = "txtFirstName";
            txtFirstName.Size = new Size(350, 26);
            txtFirstName.TabIndex = 5;
            // 
            // txtMiddleName
            // 
            txtMiddleName.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            txtMiddleName.Location = new Point(22, 243);
            txtMiddleName.Margin = new Padding(2);
            txtMiddleName.Name = "txtMiddleName";
            txtMiddleName.Size = new Size(350, 26);
            txtMiddleName.TabIndex = 6;
            // 
            // lblGender
            // 
            lblGender.AutoSize = true;
            lblGender.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblGender.Location = new Point(18, 282);
            lblGender.Margin = new Padding(2, 0, 2, 0);
            lblGender.Name = "lblGender";
            lblGender.Size = new Size(81, 20);
            lblGender.TabIndex = 7;
            lblGender.Text = "Gender *";
            // 
            // rbMale
            // 
            rbMale.AutoSize = true;
            rbMale.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            rbMale.Location = new Point(131, 282);
            rbMale.Margin = new Padding(2);
            rbMale.Name = "rbMale";
            rbMale.Size = new Size(61, 24);
            rbMale.TabIndex = 8;
            rbMale.TabStop = true;
            rbMale.Text = "Male";
            rbMale.UseVisualStyleBackColor = true;
            // 
            // rbFemale
            // 
            rbFemale.AutoSize = true;
            rbFemale.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            rbFemale.Location = new Point(245, 282);
            rbFemale.Margin = new Padding(2);
            rbFemale.Name = "rbFemale";
            rbFemale.Size = new Size(80, 24);
            rbFemale.TabIndex = 9;
            rbFemale.TabStop = true;
            rbFemale.Text = "Female";
            rbFemale.UseVisualStyleBackColor = true;
            // 
            // lblDateOfBirth
            // 
            lblDateOfBirth.AutoSize = true;
            lblDateOfBirth.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblDateOfBirth.Location = new Point(18, 331);
            lblDateOfBirth.Margin = new Padding(2, 0, 2, 0);
            lblDateOfBirth.Name = "lblDateOfBirth";
            lblDateOfBirth.Size = new Size(124, 20);
            lblDateOfBirth.TabIndex = 10;
            lblDateOfBirth.Text = "Date of Birth *";
            // 
            // cbDay
            // 
            cbDay.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            cbDay.FormattingEnabled = true;
            cbDay.Location = new Point(22, 357);
            cbDay.Margin = new Padding(2);
            cbDay.Name = "cbDay";
            cbDay.Size = new Size(107, 28);
            cbDay.TabIndex = 11;
            // 
            // cbMonth
            // 
            cbMonth.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            cbMonth.FormattingEnabled = true;
            cbMonth.Location = new Point(145, 357);
            cbMonth.Margin = new Padding(2);
            cbMonth.Name = "cbMonth";
            cbMonth.Size = new Size(107, 28);
            cbMonth.TabIndex = 12;
            // 
            // cbYear
            // 
            cbYear.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            cbYear.FormattingEnabled = true;
            cbYear.Location = new Point(267, 357);
            cbYear.Margin = new Padding(2);
            cbYear.Name = "cbYear";
            cbYear.Size = new Size(107, 28);
            cbYear.TabIndex = 13;
            // 
            // btnSubmit
            // 
            btnSubmit.BackColor = Color.Crimson;
            btnSubmit.FlatStyle = FlatStyle.Flat;
            btnSubmit.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            btnSubmit.ForeColor = Color.White;
            btnSubmit.Location = new Point(22, 478);
            btnSubmit.Margin = new Padding(2);
            btnSubmit.Name = "btnSubmit";
            btnSubmit.Size = new Size(262, 47);
            btnSubmit.TabIndex = 14;
            btnSubmit.Text = "Register Student";
            btnSubmit.UseVisualStyleBackColor = false;
            btnSubmit.Click += btnSubmit_Click;
            // 
            // lblProgram
            // 
            lblProgram.AutoSize = true;
            lblProgram.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblProgram.Location = new Point(18, 406);
            lblProgram.Margin = new Padding(2, 0, 2, 0);
            lblProgram.Name = "lblProgram";
            lblProgram.Size = new Size(158, 20);
            lblProgram.TabIndex = 15;
            lblProgram.Text = "Program to Apply *";
            // 
            // cbProgram
            // 
            cbProgram.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            cbProgram.FormattingEnabled = true;
            cbProgram.Location = new Point(22, 432);
            cbProgram.Margin = new Padding(2);
            cbProgram.Name = "cbProgram";
            cbProgram.Size = new Size(394, 28);
            cbProgram.TabIndex = 16;
            // 
            // Video_NewFrame
            // 
            Video_NewFrame.BackColor = SystemColors.ActiveBorder;
            Video_NewFrame.Location = new Point(460, 57);
            Video_NewFrame.Margin = new Padding(2);
            Video_NewFrame.Name = "Video_NewFrame";
            Video_NewFrame.Size = new Size(472, 407);
            Video_NewFrame.TabIndex = 17;
            Video_NewFrame.TabStop = false;
            // 
            // btnCapture_Click
            // 
            btnCapture_Click.Font = new Font("Microsoft Sans Serif", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            btnCapture_Click.Location = new Point(629, 485);
            btnCapture_Click.Margin = new Padding(2);
            btnCapture_Click.Name = "btnCapture_Click";
            btnCapture_Click.Size = new Size(131, 32);
            btnCapture_Click.TabIndex = 18;
            btnCapture_Click.Text = "Capture";
            btnCapture_Click.UseVisualStyleBackColor = true;
            btnCapture_Click.Click += BtnCapture_Click;
            // 
            // fileSystemWatcher1
            // 
            fileSystemWatcher1.EnableRaisingEvents = true;
            fileSystemWatcher1.SynchronizingObject = this;
            // 
            // frmStudentRegistration
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(974, 547);
            Controls.Add(btnCapture_Click);
            Controls.Add(Video_NewFrame);
            Controls.Add(cbProgram);
            Controls.Add(lblProgram);
            Controls.Add(btnSubmit);
            Controls.Add(cbYear);
            Controls.Add(cbMonth);
            Controls.Add(cbDay);
            Controls.Add(lblDateOfBirth);
            Controls.Add(rbFemale);
            Controls.Add(rbMale);
            Controls.Add(lblGender);
            Controls.Add(txtMiddleName);
            Controls.Add(txtFirstName);
            Controls.Add(txtLastName);
            Controls.Add(lblMiddleName);
            Controls.Add(lblFirstName);
            Controls.Add(lblLastName);
            Controls.Add(lblFormName);
            Margin = new Padding(2);
            Name = "frmStudentRegistration";
            Text = "Student Registration";   
            ((System.ComponentModel.ISupportInitialize)Video_NewFrame).EndInit();
            ((System.ComponentModel.ISupportInitialize)fileSystemWatcher1).EndInit();
            ResumeLayout(false);
            PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblFormName;
        private System.Windows.Forms.Label lblLastName;
        private System.Windows.Forms.Label lblFirstName;
        private System.Windows.Forms.Label lblMiddleName;
        private System.Windows.Forms.TextBox txtLastName;
        private System.Windows.Forms.TextBox txtFirstName;
        private System.Windows.Forms.TextBox txtMiddleName;
        private System.Windows.Forms.Label lblGender;
        private System.Windows.Forms.RadioButton rbMale;
        private System.Windows.Forms.RadioButton rbFemale;
        private System.Windows.Forms.Label lblDateOfBirth;
        private System.Windows.Forms.ComboBox cbDay;
        private System.Windows.Forms.ComboBox cbMonth;
        private System.Windows.Forms.ComboBox cbYear;
        private System.Windows.Forms.Button btnSubmit;
        private System.Windows.Forms.Label lblProgram;
        private System.Windows.Forms.ComboBox cbProgram;
        private System.Windows.Forms.PictureBox Video_NewFrame;
        private System.Windows.Forms.Button btnCapture_Click;
        private System.IO.FileSystemWatcher fileSystemWatcher1;
    }
}

