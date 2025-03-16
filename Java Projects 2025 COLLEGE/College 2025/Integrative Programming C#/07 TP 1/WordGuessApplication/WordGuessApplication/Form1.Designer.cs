namespace WordGuessApplication
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
            lblWord = new Label();
            btnGuess = new Button();
            txtGuess = new TextBox();
            lblWrongGuesses = new Label();
            lstWrongGuesses = new ListBox();
            button1 = new Button();
            button2 = new Button();
            SuspendLayout();
            // 
            // lblWord
            // 
            lblWord.AutoSize = true;
            lblWord.BackColor = Color.DarkSeaGreen;
            lblWord.Font = new Font("Segoe UI", 16.25F, FontStyle.Bold);
            lblWord.ForeColor = Color.White;
            lblWord.Location = new Point(124, 34);
            lblWord.Name = "lblWord";
            lblWord.Size = new Size(76, 30);
            lblWord.TabIndex = 0;
            lblWord.Text = "label1";
            lblWord.TextAlign = ContentAlignment.MiddleCenter;
            lblWord.Click += lblWord_Click;
            // 
            // btnGuess
            // 
            btnGuess.BackColor = Color.DarkSeaGreen;
            btnGuess.FlatStyle = FlatStyle.Flat;
            btnGuess.Font = new Font("Segoe UI", 12F);
            btnGuess.ForeColor = Color.White;
            btnGuess.Location = new Point(78, 140);
            btnGuess.Name = "btnGuess";
            btnGuess.Size = new Size(180, 32);
            btnGuess.TabIndex = 1;
            btnGuess.Text = "Guess";
            btnGuess.UseVisualStyleBackColor = false;
            btnGuess.Click += btnGuess_Click;
            // 
            // txtGuess
            // 
            txtGuess.Font = new Font("Segoe UI", 14.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            txtGuess.Location = new Point(41, 101);
            txtGuess.Name = "txtGuess";
            txtGuess.Size = new Size(267, 33);
            txtGuess.TabIndex = 2;
            txtGuess.TextAlign = HorizontalAlignment.Center;
            txtGuess.TextChanged += textBox1_TextChanged;
            // 
            // lblWrongGuesses
            // 
            lblWrongGuesses.AutoSize = true;
            lblWrongGuesses.BackColor = Color.DarkSeaGreen;
            lblWrongGuesses.Font = new Font("Segoe UI", 12F);
            lblWrongGuesses.ForeColor = Color.White;
            lblWrongGuesses.Location = new Point(380, 27);
            lblWrongGuesses.Name = "lblWrongGuesses";
            lblWrongGuesses.Size = new Size(102, 21);
            lblWrongGuesses.TabIndex = 3;
            lblWrongGuesses.Text = "Wrong guess";
            lblWrongGuesses.Click += lblWrongGuesses_Click;
            // 
            // lstWrongGuesses
            // 
            lstWrongGuesses.FormattingEnabled = true;
            lstWrongGuesses.ItemHeight = 15;
            lstWrongGuesses.Location = new Point(342, 69);
            lstWrongGuesses.Name = "lstWrongGuesses";
            lstWrongGuesses.Size = new Size(175, 139);
            lstWrongGuesses.TabIndex = 4;
            lstWrongGuesses.UseTabStops = false;
            lstWrongGuesses.SelectedIndexChanged += lstWrongGuesses_SelectedIndexChanged;
            // 
            // button1
            // 
            button1.BackColor = Color.DarkSeaGreen;
            button1.Location = new Point(12, 12);
            button1.Name = "button1";
            button1.Size = new Size(324, 83);
            button1.TabIndex = 5;
            button1.UseVisualStyleBackColor = false;
            // 
            // button2
            // 
            button2.BackColor = Color.DarkSeaGreen;
            button2.Location = new Point(342, 12);
            button2.Name = "button2";
            button2.Size = new Size(175, 51);
            button2.TabIndex = 6;
            button2.UseVisualStyleBackColor = false;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(529, 228);
            Controls.Add(lstWrongGuesses);
            Controls.Add(lblWrongGuesses);
            Controls.Add(txtGuess);
            Controls.Add(btnGuess);
            Controls.Add(lblWord);
            Controls.Add(button1);
            Controls.Add(button2);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lblWord;
        private Button btnGuess;
        private TextBox txtGuess;
        private Label lblWrongGuesses;
        private ListBox lstWrongGuesses;
        private Button button1;
        private Button button2;
    }
}
