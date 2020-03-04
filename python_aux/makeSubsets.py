import random

og_file = open('data.txt', 'r')

lines = og_file.readlines()

og_file.close()

file1 = open('subset1.txt', 'w+')
lines1 = random.sample(lines, 298)
file1.writelines(lines1)
file1.close()

file2 = open('subset2.txt', 'w+')
lines2 = random.sample(lines, 595)
file2.writelines(lines2)
file2.close()

file3 = open('subset3.txt', 'w+')
lines3 = random.sample(lines, 893)
file3.writelines(lines3)
file3.close()

file4 = open('subset4.txt', 'w+')
lines4 = random.sample(lines, 1190)
file4.writelines(lines4)
file4.close()

file5 = open('subset5.txt', 'w+')
lines5 = random.sample(lines, 1488)
file5.writelines(lines5)
file5.close()

file6 = open('subset6.txt', 'w+')
lines6 = random.sample(lines, 1786)
file6.writelines(lines6)
file6.close()

file7 = open('subset7.txt', 'w+')
lines7 = random.sample(lines, 2083)
file7.writelines(lines7)
file7.close()

file8 = open('subset8.txt', 'w+')
lines8 = random.sample(lines, 2381)
file8.writelines(lines8)
file8.close()

file9 = open('subset9.txt', 'w+')
lines9 = random.sample(lines, 2678)
file9.writelines(lines9)
file9.close()

file10 = open('subset10.txt', 'w+')
lines10 = random.sample(lines, 2976)
file10.writelines(lines10)
file10.close()