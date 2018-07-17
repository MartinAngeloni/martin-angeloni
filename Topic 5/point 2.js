db.course.aggregate([
    {
        $unwind:"$assist"    
    },
    {
        $match:{"assist.final_note": {$gt:40} }
    },
    {
        $project:{_id:0,student_first_name:"$assist.student.first_name",
            student_last_name:"$assist.student.last_name",
            assist_final_note:"$assist.final_note"}
    }
])