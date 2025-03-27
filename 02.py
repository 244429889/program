while True:  
    m, n, x, y = map(int,input().split())  
    a = 0  
    b = 0  
    c= 1  
    d = 100000  
    while c <= m <= d and c <= n <= d and c <= x <= d and c <= y <= d:  
            for i in range(m, n+1):  
                if i % x == 0 or i % y == 0:  
                  if i % x == 0 and i % y == 0:  
                     continue  
                  a = a + i  
                  b = b + (i **2)  
            if i == n :  
                  print("您輸入的數值為",m,"、",n,"、",x,"、",y,"，",m,"~",n,"之間可被",x,"或",y,"整除，但不可被",x,"及",y,"同時整除的整數和為",a,"，平方和為",b,sep = '')  
            break  
    else:  
        print("您輸入的數值為",m,"、",n,"、",x,"、",y,"，請輸入1~100000的整數",sep = '')  
