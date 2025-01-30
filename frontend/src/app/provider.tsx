import ContentLayout from "@/components/layout/content";
import React from "react";
import { BrowserRouter } from "react-router-dom";

function AppProvider({ children }: { children: React.ReactNode }) {
  return (
    <BrowserRouter>
      <ContentLayout>{children}</ContentLayout>
    </BrowserRouter>
  );
}

export default AppProvider;
