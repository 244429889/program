while True:      
    n, a, b, c = map(int,input().split())   
    e = ((a + b) * c) / 2       
    if n == 1:     
        x = max(a, b, c)      
        y = min(a, b, c)      
        z = (a + b + c) - (x + y)    
        if a <= 0 or b <= 0 or c <= 0:      
            print("您選擇1，輸入格式錯誤，請輸入大於0的數值",end = '\n')      
        elif (x **2) == (y **2) + (z **2):      
            print("您選擇1，三邊長",a,"、",b,"、",c,"可構成三角形",sep = "",end = '\n')      
        else:      
            print("您選擇1，三邊長",a,"、",b,"、",c,"無法構成三角形",sep = "",end = '\n')      
    elif n == 2:     
        if c % 2 == 0:    
            e = int(((a + b) * c) / 2)    
        else:    
            e = e    
        if a <= 0 or b <= 0 or c <= 0:      
            print("您選擇2，輸入格式錯誤，請輸入大於0的數值",end = '\n')      
        else:      
            print("您選擇2，上底",a,"、下底",b,"、高",c,"，梯形面積為",e,sep = "",end = '\n')      
    else:      
        print("您選擇",n,"，沒有此選項",sep = "",end = '\n')  
