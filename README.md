Дамјан Сепетовски 206046

Control Flow Graph
![cfg2](https://github.com/sepetovski/SI_2023_lab2_206046/assets/4062464/4b01d36f-6934-4e0a-af22-afb8be09da59)

Цикломатска комплексност
Цикломатската комплексност се добива преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па тогаш цикломатската комплексност ќе изнесува 11.

Every branch
Every branch потребни се 4 тест случаеви:

со null user
нема username, невалиден password
username постои, e,email постои, password < 8
password со space, различен user
![Screenshot 2023-05-31 223054](https://github.com/sepetovski/SI_2023_lab2_206046/assets/4062464/5f43539d-e32f-42d3-bec9-3f3b2b53dae5)


Multiple Condition 4 случаеви:

username!=null password!=null email==null F F T
username!=null password==null email!=null F T F
username==null password!=null email!=null T F F
username==null password==null email==null T T T
