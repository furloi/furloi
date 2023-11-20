#######################################################
#  This program uses the micropython-stepper package  #
#  found on the PyPi repository at                    #
#  https://pypi.org/project/micropython-stepper/ by   #
#  redoxcode to drive a stepper motor attached to a   #
#  fireplace bellows in a way that approximates a     #
#  human lung.                                        #
#          Code is written in micropython.            #
#######################################################


from stepper import Stepper
import utime

steppah = Stepper(21,20,en_pin=None,steps_per_rev=200,speed_sps=10,invert_dir=False,timer_id=-1)

# it takes approximately 9 "breaths" for the sock puppet to smoke an entire (clove) cigarette.
for i in range (9):
  steppah.free_run(1)
  utime.sleep(5.0)
  steppah.free_run(0)
  steppah.free_run(-1)
  utime.sleep(5.0)
  steppah.free_run(0)
