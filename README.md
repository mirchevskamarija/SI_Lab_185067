# Втора лабораториска вежба по Софтверско Инженерство
# Марија Мирчевска, индекс 185067
# Група на код:
Ја добив групата на код 4
# Control Flow Graph
![ControlFlowGraph](https://user-images.githubusercontent.com/62524511/84253086-c79c7480-ab0f-11ea-9f2e-91c73d40ca97.PNG)

# Цикломатска комплексност
Број на ребра (edges) = 29   
Број на јазли (nodes) = 22     
Edges - nodes + 2 = 29 - 22 + 2 = 9    
Цикломатската комплексност е 9.
# Тест случаи според критерумот Multiple Condition
Услов 1: if (user.getUsername()!=null && user.getPassword()!=null)  
 user = {username:"Tenda", password:123internet, email: whatever)  
 user = {username:"Tenda", password:null, email: whatever)  
 user = {username:null, password:whatever, email: whatever)   
 
Услов 2: if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length() >= 8)  
  user = {username:"Tenda", password:123internet, email: whatever)   
  user = {username:"Tenda", password:123i, email: whatever)   
  user = {username:"Tenda", password:123interne, email: whatever)   
  
Услов 3: if (digit && upper && special)
  digit = 3, upper = 3, special = 3  
  digit = 3, upper = 3, special = 0  
  digit = 3, upper = 4, special = 4  
  digit = 3, upper = 5, special = 5  
# Tест случаи според критерумот Every Statement

# Објаснување на напишаните unit tests

Multiple Condition тестовите се користат за да се тестираат деловите од кодот кој што зависат од повеќе услови, односно вклучуваат && или ||. Знакот X означува дека вредноста на негово место (Т/F) не влијае врз на резултатот на изразот. Во мојот случај тоа се условите:
1. if (user.getUsername()!=null && user.getPassword()!=null)
   - Ги проверува случаите: TT, TF, FX.
2. if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length() >= 8)
   - Ги проверува случаите: TT,  TF, FX
3. if (digit && upper && special)
   - Ги проверува случаите: TTT, TTF, TFX, FXX



