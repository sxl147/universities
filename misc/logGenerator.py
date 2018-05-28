import os
import string
import random
import time
import datetime

# the sole purpose of this python script is to simulate a basic logging system that a lot
# of applications use

applications = ['BOL','MMS','PBP']
items = ['APP_ID=1-ABCDEFG','subscriber_id=123456789','subscriber_id=987654321','APP_ID=1-XYZ123']
file = open('/home/cloudera/textfiles/flumeLogger1logs/SystemOut.log','a')
y = 1

# generate a random logging message
def id_generator(size, chars=string.ascii_uppercase + string.digits):
    return ''.join(random.choice(chars) for _ in range(size))

     
for x in range(1,300):
                ts = time.time()
                t = datetime.datetime.fromtimestamp(ts).strftime('%Y-%m-%d %H:%M:%S')
                application = random.choice(applications)
                item = random.choice(items)
                # log file format will be : timestamp, then application code, then an identifier code, then a random message
                file.write(str(t) + '^' + str(application) + '^' + str(item) + '^' + id_generator(30) + '\n')
                
                # simulation of a file rollover 
                if x%100 == 0:
                                file.close()
                                os.rename('/home/cloudera/textfiles/flumeLogger1logs/SystemOut.log',
                                '/home/cloudera/textfiles/flumeLogger1logs/SystemOut_'+str(y)+'.log')
                                y += 1
                                file = open('/home/cloudera/textfiles/flumeLogger1logs/SystemOut.log','a')
                # variable time delay for testing the flume system's sensitivity
                time.sleep(0.5)
file.close()