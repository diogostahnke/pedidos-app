import { paths } from "@/config/paths";
import { Route, Routes } from "react-router-dom";

function AppRouter() {
  return (
    <Routes>
      {paths.map(({ path, Component }) => (
        <Route key={`${path}`} {...{ path }} element={<Component />} />
      ))}
    </Routes>
  );
}

export default AppRouter;
