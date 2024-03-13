
 # Author : Priyandhini
 # Email : priyandhinip@gmail.com
 # Date : 12/march/2024
 # Description : In this program,Language Translator App in Python using Google Translate API
 


from tkinter import *
from tkinter import ttk
import tkinter as tk
from googletrans import Translator
from tkinter import messagebox

root= tk.Tk()
root.title('Language Translator')
root.geometry('590x370')


Frame1= Frame(root, width=590,height=370, relief=RIDGE,borderwidth=5,bg='#F8A1F8')
Frame1.place(x=0, y=0)


Label(root, text="Language Translator", font=("Helvetica 20 bold"), fg="white", bg='#EB0BEB').pack(pady=10)

def translate():
    lang_1 = text_entry1.get("1.0","end-1c")
    cl = choose_language.get()

    if lang_1 == '':
        messagebox.showerror('Language Translator', 'Enter the text to translate!')
    else:
        text_entry2.delete(1.0, 'end')
        translator = Translator()
        output = translator.translate(lang_1, dest=cl)
        text_entry2.insert('end',output.text)


def clear():
    text_entry1.delete(1.0, 'end')
    text_entry2.delete(1.0, 'end')


a=tk.StringVar()



auto_select= ttk.Combobox(Frame1,width=27,textvariable=a,state='randomly',font=('verdana',10, 'bold'))

auto_select['values'] = (
                           'Auto Select',
                           
                           
                        )

auto_select.place(x=15,y=60)
auto_select.current(0)


l= tk.StringVar()
choose_language=ttk.Combobox(Frame1,width=27,textvariable=l,state='randomly',font=('verdana',10, 'bold'))

choose_language['values']=(
  'Afrikaans',
  'Akan',
  'Albanian',
  'Amharic',
 'Arabic',
 'Armenian',
  'Assamese',
  'Aymara',
 'Azerbaijani',
'Bambara',
'Bangla',
'Basque',
'Belarusian',
'Bhojpuri',
'Bosnian',
'Bulgarian',
'Burmese',
'Catalan',
'Cebuano',
'Central Kurdish',
'Chinese' ,
'Chinese' ,
'Corsican',
'Croatian',
'Czech',
'Danish',
'Divehi',
'Dogri',
'Dutch',
'English',
'Esperanto',
'Estonian',
'Ewe',
'Filipino',
'Finnish',
'French',
'Galician',
'Ganda',
'Georgian',
'German',
'Goan Konkani',
'Greek',
'Guarani',
'Gujarati',
'Haitian Creole',
'Hausa',
'Hawaiian',
'Hebrew',
'Hindi',
'Hmong',
'Hungarian',
'Icelandic',
'Igbo',
'Iloko',
'Indonesian',
'Irish',
'Italian',
'Japanese',
'Javanese',
'Kannada',
'Kazakh',
'Khmer',
'Kinyarwanda',
'Korean',
'Krio',
'Kurdish',
'Kyrgyz',
'Lao',
'Latin',
'Latvian',
'Lingala',
'Lithuanian',
'Luxembourgish',
'Macedonian',
'Maithili',
'Malagasy',
'Malay',
'Malayalam',
'Maltese',
'Manipuri ',
'Māori',
'Marathi',
'Mizo',
'Mongolian',
'Nepali',
'Northern Sotho',
'Norwegian',
'Nyanja',
'Odia',
'Oromo',
'Pashto',
'Persian',
'Polish',
'Portuguese',
'Punjabi',
'Quechua',
'Romanian',
'Russian',
'Samoan',
'Sanskrit',
'Scottish Gaelic',
'Serbian',
'Shona',
'Sindhi',
'Sinhala',
'Slovak',
'Slovenian',
'Somali',
'Southern Sotho',
'Spanish',
'Sundanese',
'Swahili',
'Swedish',
'Tajik',
'Tamil',
'Tatar',
'Telugu',
'Thai',
'Tigrinya',
'Tsonga',
'Turkish',
'Turkmen',
'Ukrainian',
'Urdu',
'Uyghur',
'Uzbek',
'Vietnamese',
'Welsh',
'Western Frisian',
'Xhosa',
'Yiddish',
'Yoruba',
'Zulu'

          )

choose_language.place(x=305, y=60)
choose_language.current(0)


text_entry1= Text(Frame1,width=20,height=7,borderwidth=5,relief=RIDGE,font=('verdana',15))
text_entry1.place(x=10,y=100)

text_entry2=Text(Frame1,width=20,height=7,borderwidth=5,relief=RIDGE,font=('verdana',15))
text_entry2.place(x=300,y=100)

btn1=Button(Frame1,command=translate, text="Translate", relief=RAISED, borderwidth=2, font=('verdana', 10, 'bold'), bg='#AC07AC', fg="white", cursor="hand2")
btn1.place(x=185,y=300)

btn2=Button(Frame1,command=clear, text="Clear", relief=RAISED, borderwidth=2, font=('verdana', 10, 'bold'), bg='#AC07AC', fg="white", cursor="hand2")
btn2.place(x=300,y=300)

root.mainloop()




