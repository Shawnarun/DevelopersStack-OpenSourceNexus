function addTask() {
    var taskInput = document.getElementById("taskInput");
    var taskList = document.getElementById("taskList");
    
    if (taskInput.value === "") {
        alert("Please enter a task");
        return;
    }

    var taskBox = document.createElement("div");
    taskBox.className = "task-box";

    var checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.className = "checkbox";

    var taskText = document.createElement("span");
    taskText.textContent = taskInput.value;

    var deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.className = "delete-btn";
    deleteBtn.onclick = function() {
        taskBox.remove();
    };

    taskBox.appendChild(checkbox);
    taskBox.appendChild(taskText);
    taskBox.appendChild(deleteBtn);

    taskList.appendChild(taskBox);

    taskInput.value = "";
}
