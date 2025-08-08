namespace Account_Registration
{
    partial class FrmRegistration
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            label5 = new Label();
            label6 = new Label();
            label7 = new Label();
            label8 = new Label();
            studentNo_txt = new TextBox();
            ln_txt = new TextBox();
            fn_txt = new TextBox();
            mn_txt = new TextBox();
            age_txt = new TextBox();
            contactNo_txt = new TextBox();
            address_txt = new TextBox();
            cbProg = new ComboBox();
            Next = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(28, 25);
            label1.Name = "label1";
            label1.Size = new Size(70, 15);
            label1.TabIndex = 0;
            label1.Text = "Student No:";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(212, 25);
            label2.Name = "label2";
            label2.Size = new Size(56, 15);
            label2.TabIndex = 1;
            label2.Text = "Program:";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(28, 78);
            label3.Name = "label3";
            label3.Size = new Size(63, 15);
            label3.TabIndex = 2;
            label3.Text = "Last Name";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(212, 78);
            label4.Name = "label4";
            label4.Size = new Size(64, 15);
            label4.TabIndex = 3;
            label4.Text = "First Name";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(401, 78);
            label5.Name = "label5";
            label5.Size = new Size(79, 15);
            label5.TabIndex = 4;
            label5.Text = "Middle Name";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(28, 131);
            label6.Name = "label6";
            label6.Size = new Size(31, 15);
            label6.TabIndex = 5;
            label6.Text = "Age:";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(212, 131);
            label7.Name = "label7";
            label7.Size = new Size(71, 15);
            label7.TabIndex = 6;
            label7.Text = "Contact No:";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(28, 188);
            label8.Name = "label8";
            label8.Size = new Size(49, 15);
            label8.TabIndex = 7;
            label8.Text = "Address";
            // 
            // studentNo_txt
            // 
            studentNo_txt.Location = new Point(28, 43);
            studentNo_txt.Name = "studentNo_txt";
            studentNo_txt.Size = new Size(178, 23);
            studentNo_txt.TabIndex = 8;
            // 
            // ln_txt
            // 
            ln_txt.Location = new Point(28, 96);
            ln_txt.Name = "ln_txt";
            ln_txt.Size = new Size(178, 23);
            ln_txt.TabIndex = 9;
            // 
            // fn_txt
            // 
            fn_txt.Location = new Point(212, 96);
            fn_txt.Name = "fn_txt";
            fn_txt.Size = new Size(178, 23);
            fn_txt.TabIndex = 10;
            // 
            // mn_txt
            // 
            mn_txt.Location = new Point(401, 96);
            mn_txt.Name = "mn_txt";
            mn_txt.Size = new Size(151, 23);
            mn_txt.TabIndex = 11;
            // 
            // age_txt
            // 
            age_txt.Location = new Point(28, 149);
            age_txt.Name = "age_txt";
            age_txt.Size = new Size(178, 23);
            age_txt.TabIndex = 12;
            // 
            // contactNo_txt
            // 
            contactNo_txt.Location = new Point(212, 149);
            contactNo_txt.Name = "contactNo_txt";
            contactNo_txt.Size = new Size(178, 23);
            contactNo_txt.TabIndex = 13;
            // 
            // address_txt
            // 
            address_txt.Location = new Point(28, 206);
            address_txt.Multiline = true;
            address_txt.Name = "address_txt";
            address_txt.Size = new Size(524, 115);
            address_txt.TabIndex = 14;
            // 
            // cbProg
            // 
            cbProg.FormattingEnabled = true;
            cbProg.Location = new Point(212, 43);
            cbProg.Name = "cbProg";
            cbProg.Size = new Size(227, 23);
            cbProg.TabIndex = 15;
            // 
            // Next
            // 
            Next.Location = new Point(237, 350);
            Next.Name = "Next";
            Next.Size = new Size(75, 23);
            Next.TabIndex = 16;
            Next.Text = "Next";
            Next.UseVisualStyleBackColor = true;
            Next.Click += Next_Click;
            // 
            // FrmRegistration
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(602, 400);
            Controls.Add(Next);
            Controls.Add(cbProg);
            Controls.Add(address_txt);
            Controls.Add(contactNo_txt);
            Controls.Add(age_txt);
            Controls.Add(mn_txt);
            Controls.Add(fn_txt);
            Controls.Add(ln_txt);
            Controls.Add(studentNo_txt);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(label6);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "FrmRegistration";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Label label5;
        private Label label6;
        private Label label7;
        private Label label8;
        private TextBox studentNo_txt;
        private TextBox ln_txt;
        private TextBox fn_txt;
        private TextBox mn_txt;
        private TextBox age_txt;
        private TextBox contactNo_txt;
        private TextBox address_txt;
        private ComboBox cbProg;
        private Button Next;
    }
}
