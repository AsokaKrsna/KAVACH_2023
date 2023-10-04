import tkinter as tk
from tkinter import filedialog, simpledialog
import subprocess

def push_apk():
    apk_path = filedialog.askopenfilename(title="Select APK file to push", filetypes=[("APK Files", "*.apk")])
    if apk_path:
        destination = "/data/local/tmp"
        command = f'adb push "{apk_path}" "{destination}"'
        subprocess.run(command, shell=True)
        result_label.config(text="APK pushed successfully.")

def install_apk():
    apk_name = simpledialog.askstring("APK Installation", "Enter APK file name:")
    if apk_name:
        command = f'adb shell pm install -r -d /data/local/tmp/{apk_name}'
        subprocess.run(command, shell=True)
        result_label.config(text="APK installed successfully.")

# Create the main window
window = tk.Tk()
window.title("ADB Tool GUI")

# Create widgets
push_button = tk.Button(window, text="Push APK", command=push_apk)
install_button = tk.Button(window, text="Install APK", command=install_apk)
result_label = tk.Label(window, text="")

# Place widgets on the window
push_button.pack(pady=10)
install_button.pack(pady=10)
result_label.pack()

# Start the GUI event loop
window.mainloop()