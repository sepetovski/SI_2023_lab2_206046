Дамјан Сепетовски 206046

Control Flow Graph
![cfg2](https://github.com/sepetovski/SI_2023_lab2_206046/assets/4062464/a2335066-2d48-43f5-a606-17adb123b51c)


Цикломатска комплексност
Цикломатската комплексност се добива преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па тогаш цикломатската комплексност ќе изнесува 11.

Every branch
Every branch потребни се 4 тест случаеви:

со null user
нема username, невалиден password
username постои, e,email постои, password < 8
password со space, различен user
![image](https://github.com/sepetovski/SI_2023_lab2_206046/assets/4062464/0d90ba27-5201-4364-93a2-441430ce2d82)



Multiple Condition 4 случаеви:

username!=null password!=null email==null F F T
username!=null password==null email!=null F T F
username==null password!=null email!=null T F F
username==null password==null email==null T T T
