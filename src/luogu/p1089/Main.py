# https://www.luogu.com.cn/problem/P1089
import sys

all_money = 0
mother_money = 0
for i in range(1, 13):
    need_money = int(input())
    all_money += 300
    tmp = int((all_money - need_money) / 100)
    mother_money += tmp * 100
    all_money -= tmp * 100

    if all_money < need_money:
        print('-' + str(i))
        sys.exit()
    all_money -= need_money
print(all_money + int(mother_money * 1.2))
