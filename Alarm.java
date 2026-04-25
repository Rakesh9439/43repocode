import time
from datetime import datetime
import os

def set_alarm(alarm_time):
    print(f"Alarm set for {alarm_time}")
    
    while True:
        current_time = datetime.now().strftime("%H:%M:%S")
        print(f"Current Time: {current_time}", end="\r")
        
        if current_time == alarm_time:
            print("\n⏰ Wake up! Alarm ringing...")
            
            # Sound (Windows)
            try:
                import winsound
                winsound.Beep(1000, 1000)
            except:
                print("Beep not supported on this OS")
            
            break
        
        time.sleep(1)

# Input from user
alarm_time = input("Enter alarm time (HH:MM:SS): ")
set_alarm(alarm_time)
