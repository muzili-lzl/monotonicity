# monotonicity
问题1：
    给定一个有序数组arr，
    代表坐落在X轴上的点，给定一个正数K，
    代表绳子的长度，返回绳子最多压中几个点？
    即使绳子边缘处盖住也算盖住
问题2：
    给定一个整形数组arr，数组中的每个值都为正数，表示完成一幅画所需的时间；
    再给定一个整数quantity，表示画匠的数量，每个画匠只能画连在一起的画作
    所有的画家并行工作，返回完成所有的画作需要的最少时间
    arr=[3,1,4],quantity=2。
        最好的分配方式为第一个画匠画3和1，所需时间为4
        第二个画匠画4，所需时间为4
        所以返回4
    arr=[1,1,1,4,3],quantity=3
        最好的分配方式为第一个画匠画前三个，所需时间为3
        第二个画匠画4，所需时间为4
        第三个画匠画3，所需时间为3
        所以返回4