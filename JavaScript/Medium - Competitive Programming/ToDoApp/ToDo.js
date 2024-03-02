function addTask() {
    const taskInput = document.getElementById("task-input");
    const taskList = document.getElementById("task-list");

    if (taskInput.value.trim() === "") {
        alert("Please enter a task");
        return;
    }

    const taskItem = document.createElement("li");
    const taskText = document.createTextNode(taskInput.value);
    taskItem.appendChild(taskText);

    const deleteButton = document.createElement("button");
    deleteButton.innerHTML = "Delete";
    deleteButton.onclick = function () {
        taskList.removeChild(taskItem);
    };

    const completeButton = document.createElement("button");
    completeButton.innerHTML = "Complete";
    completeButton.onclick = function () {
        taskItem.classList.toggle("completed");
    };

    taskItem.appendChild(deleteButton);
    taskItem.appendChild(completeButton);

    taskList.appendChild(taskItem);
    taskInput.value = "";
}
