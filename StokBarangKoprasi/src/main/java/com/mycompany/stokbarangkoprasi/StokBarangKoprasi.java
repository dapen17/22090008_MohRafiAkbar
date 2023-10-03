import mysql.connector


mydb = mysql.connector.connect(
  host="localhost",    
  user="username",       
  password="password",   
  database="koprasi"     
)


mycursor = mydb.cursor()


barcode = "12345"
nama_barang = "Nama Barang"
jumlah_stok = 10


sql = "INSERT INTO koprasi (barcode, nama_barang, jumlah_stok) VALUES (%s, %s, %s)"
val = (barcode, nama_barang, jumlah_stok)

mycursor.execute(sql, val)


mydb.commit()

print(mycursor.rowcount, "record inserted.")
