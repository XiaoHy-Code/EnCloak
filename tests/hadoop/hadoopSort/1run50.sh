#hadoop dfs -rmr terasort_output01

#hadoop jar Origin/TestForHadoopTeraSort.jar terasort_input01 terasort_output01

exec 3>&1 4>&2 1>> time_record/5.21/50-1G.log 2>&1

I=1
II=2   #6

while [ $I -le $II ]
do
	#echo $I>>time_record/replace.log
	echo $I
	hadoop dfs -rmr terasort_output01
  	time hadoop jar 50/ReplaceTestForHadoopTeraSort.jar terasort_input01 terasort_output01

I=`expr $I + 1`
done

