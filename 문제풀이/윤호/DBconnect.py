[문제]
# 오늘 배운 파이썬으로 데이터베이스를 접속하고 1. 조건별 출력 그리고 2. 삭제기능을 만드세용!~
# MySQLdb or sqlite3 사용
#데이터베이스 링크 =>./data/study.db
#데이터베이스 컬럼 id, name, age, addr
##데이터베이스 host = localhost / port= 3308 / db = study / users = root / password = 12345

#1. 조건 : name에 '영' 이라는 글자 그리고 age는 25이상인 데이터를 모두 출력
#2. 조건 :나이가 20세에서 30세 사이이고 주소가 '서울' 또는 '부산'인 사용자를 검색하며, 그 결과를 나이를 기준으로 내림차순으로 정렬하기

#####################################################################
#데이터베이스가 없기 떄문에 임시로 있다고 생각해서 오늘 배운 파이썬 코드 활용하면서 복습한다는 개념으로 코드 작성하기!!
# 3개의 코드가 나와야합니다.    // 메서드를 만들어서 작성
# 꼭 밑의 형식을 따라할 필요는 없습니당!
# 수업시간에 한 코드 보면서 공부해도 좋습니다.!!
#조건1을 풀게되면 2는 금방 풀어서 열시미 해봅시다!

----------------------------------------------------------------------
[sqlite3]
#형식
# study 데이터 베이스 안에 study라는 테이블을 만들었다고 가정
import sqlite3
    
#조건 1
def con1(name, age):
    conn = sqlite3.connect('./data/study/db')
    cursor = conn.cursor()


    sql = 'select * from study where name like ? and age >= ?'
    cursor.execute(sql, (name,age))

    books = cursor.fetchall()

    #출력문
    for book in books:
        print(books)

    cursor.close()
    conn.close()
        
con1("영",25)


# 조건 2
def con2():
    conn = sqlite3.connect('./data/study.db')
    cursor = conn.cursor()

    sql = "select * from study where age>? and age<? and addr in (?, ?) order by age desc"
    cursor.execute(sql, (20,30,'서울','부산'))

    datas = cursor.fetchall()

    #출력문
    for data in datas:
        print(data)
        
    cursor.close()
    conn.close()

con2()

#####################################################################
[MySQL(MariaDB)]
#형식
import MySQLdb


#조건 1
def mysql_con1(name, age):
    conn = MySQLdb.connect(host='localhost',port='3308',db='study',user='root',password='12345')
    cursor = conn.connect()

    sql = 'select * from study where name like %s and age >= %s'
    cursor.execute(sql, (name,age))

    books = cursor.fetchall()

    #출력문
    for book in books:
        print(books)

    cursor.close()
    conn.close()
        
mysql_con1("영",25)


# 조건 2
def mysql_con2():
    conn = sqlite3.connect('./data/study.db')
    cursor = conn.cursor()

    sql = 'select * from study where age > %s and age < %s and addr in (%s, %s) order by age desc'
    cursor.execute(sql, (20,30,'서울','부산'))

    datas = cursor.fetchall()

    #출력문
    for data in datas:
        print(data)
        
    cursor.close()
    conn.close()

mysql_con2()
