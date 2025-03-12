namespace StudentGradeApplication
{
    partial class Form1
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
            components = new System.ComponentModel.Container();
            textBox1 = new TextBox();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            imageList1 = new ImageList(components);
            label5 = new Label();
            label6 = new Label();
            label7 = new Label();
            txtEnglish = new TextBox();
            txtMath = new TextBox();
            txtScience = new TextBox();
            txtFilipino = new TextBox();
            txtHistory = new TextBox();
            button1 = new Button();
            linkLabel1 = new LinkLabel();
            lblResult = new Label();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Location = new Point(113, 37);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(218, 23);
            textBox1.TabIndex = 0;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(48, 40);
            label1.Name = "label1";
            label1.Size = new Size(42, 15);
            label1.TabIndex = 1;
            label1.Text = "Name:";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 11F);
            label2.Location = new Point(113, 84);
            label2.Name = "label2";
            label2.Size = new Size(55, 20);
            label2.TabIndex = 2;
            label2.Text = "Grades";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(48, 129);
            label3.Name = "label3";
            label3.Size = new Size(48, 15);
            label3.TabIndex = 3;
            label3.Text = "English:";
            label3.Click += label3_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(48, 179);
            label4.Name = "label4";
            label4.Size = new Size(38, 15);
            label4.TabIndex = 4;
            label4.Text = "Math:";
            // 
            // imageList1
            // 
            imageList1.ColorDepth = ColorDepth.Depth32Bit;
            imageList1.ImageSize = new Size(16, 16);
            imageList1.TransparentColor = Color.Transparent;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(48, 227);
            label5.Name = "label5";
            label5.Size = new Size(50, 15);
            label5.TabIndex = 5;
            label5.Text = "Science:";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(48, 323);
            label6.Name = "label6";
            label6.Size = new Size(48, 15);
            label6.TabIndex = 6;
            label6.Text = "History:";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(48, 274);
            label7.Name = "label7";
            label7.Size = new Size(49, 15);
            label7.TabIndex = 7;
            label7.Text = "Filipino:";
            // 
            // txtEnglish
            // 
            txtEnglish.Location = new Point(113, 126);
            txtEnglish.Name = "txtEnglish";
            txtEnglish.Size = new Size(74, 23);
            txtEnglish.TabIndex = 8;
            // 
            // txtMath
            // 
            txtMath.Location = new Point(113, 176);
            txtMath.Name = "txtMath";
            txtMath.Size = new Size(74, 23);
            txtMath.TabIndex = 9;
            // 
            // txtScience
            // 
            txtScience.Location = new Point(113, 224);
            txtScience.Name = "txtScience";
            txtScience.Size = new Size(74, 23);
            txtScience.TabIndex = 10;
            // 
            // txtFilipino
            // 
            txtFilipino.Location = new Point(113, 271);
            txtFilipino.Name = "txtFilipino";
            txtFilipino.Size = new Size(74, 23);
            txtFilipino.TabIndex = 11;
            // 
            // txtHistory
            // 
            txtHistory.Location = new Point(113, 320);
            txtHistory.Name = "txtHistory";
            txtHistory.Size = new Size(74, 23);
            txtHistory.TabIndex = 12;
            // 
            // button1
            // 
            button1.Location = new Point(48, 369);
            button1.Name = "button1";
            button1.Size = new Size(139, 69);
            button1.TabIndex = 13;
            button1.Text = "Generate Average";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // linkLabel1
            // 
            linkLabel1.AutoSize = true;
            linkLabel1.Location = new Point(454, 179);
            linkLabel1.Name = "linkLabel1";
            linkLabel1.Size = new Size(0, 15);
            linkLabel1.TabIndex = 14;
            // 
            // lblResult
            // 
            lblResult.AutoSize = true;
            lblResult.Font = new Font("Segoe UI", 11F);
            lblResult.Location = new Point(291, 222);
            lblResult.Name = "lblResult";
            lblResult.Size = new Size(0, 20);
            lblResult.TabIndex = 15;
            lblResult.TextAlign = ContentAlignment.MiddleCenter;
            lblResult.Click += label8_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(702, 463);
            Controls.Add(lblResult);
            Controls.Add(linkLabel1);
            Controls.Add(button1);
            Controls.Add(txtHistory);
            Controls.Add(txtFilipino);
            Controls.Add(txtScience);
            Controls.Add(txtMath);
            Controls.Add(txtEnglish);
            Controls.Add(label7);
            Controls.Add(label6);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(textBox1);
            Name = "Form1";
            Text = "Student Grade Application";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private ImageList imageList1;
        private Label label5;
        private Label label6;
        private Label label7;
        private TextBox txtEnglish;
        private TextBox txtMath;
        private TextBox txtScience;
        private TextBox txtFilipino;
        private TextBox txtHistory;
        private Button button1;
        private LinkLabel linkLabel1;
        private Label lblResult;
    }
}
