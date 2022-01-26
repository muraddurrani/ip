package duke.command;

import duke.*;
import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;

public class UnmarkCommand extends Command {
    private final int index;

    public UnmarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        Task selectedTask = taskList.getTask(index);
        selectedTask.markAsIncomplete();
        ui.displayUnmarkedTask(selectedTask);
        storage.write(taskList.getTasks());
    }
}