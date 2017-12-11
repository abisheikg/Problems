
def reverse_string(str):
	str = str[::-1]
	print "Inside Function = " + str
	return str
	
			

str = 'Hello World '
str = reverse_string(str)
print "Reversed String = "+ str

#
str = "Hello  World"
split_list = str.split(' ')
print split_list
for string in split_list:
	print string
	string= reverse_string(string)
print split_list
# Does not change
for index, string in enumerate(split_list):
	string= reverse_string(string)
	split_list[index]=string
print split_list


joined_string =""
joined_string = " ".join(split_list)# Reverse operation of split
print joined_string	

str = reverse_string(joined_string)
print "Reversed Sentence = "+str
#Use Join Now

##The logic in C++ same thing will work 
